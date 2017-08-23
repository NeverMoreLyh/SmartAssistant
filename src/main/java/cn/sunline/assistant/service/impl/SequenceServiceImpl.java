package cn.sunline.assistant.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sunline.assistant.bean.comm.CommSequence;
import cn.sunline.assistant.dao.ISequenceDao;
import cn.sunline.assistant.service.ISequenceService;
import cn.sunline.assistant.utils.CommUtil;
@Service("ISequenceService")
public class SequenceServiceImpl implements ISequenceService {
	@Resource
	ISequenceDao seqDao;
	@Override
	public String getSequence(String seqid) {
		CommSequence cs = seqDao.selectOne_CommSequence_byId(seqid);
		int xuho;
		if(CommUtil.isNotNull(cs)){
			xuho = cs.getNow();
			if(CommUtil.isNull(xuho)){
				xuho = cs.getMin();
			}
			int step = cs.getStep();
			int max = cs.getMax();
			if(xuho+step>max){
				System.out.println("loop1111111"+cs.getIsloop());
				if("1".equals(cs.getIsloop())||cs.getIsloop() == "1"){
					cs.setNow(cs.getMin());
				}else{
					throw new RuntimeException("序列超过最大值");
				}
			}else{
				cs.setNow(xuho+step);
			}
			int ret = seqDao.upd_CommSequence_byId(cs);
			if(ret != 1){
				throw new RuntimeException("此序号已被获取,请重新获取");
			}
		}else{
			throw new RuntimeException(seqid+"对应的序列参数不存在");
		}
		return String.valueOf(xuho);
	}
	@Override
	public String getSequenceWithName(String name, String seqid) {
		return name+getSequence(seqid);
	}

}
