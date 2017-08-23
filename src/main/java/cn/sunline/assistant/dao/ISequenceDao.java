package cn.sunline.assistant.dao;

import cn.sunline.assistant.annotation.DeployDao;
import cn.sunline.assistant.bean.comm.CommSequence;

@DeployDao
public interface ISequenceDao {
	CommSequence selectOne_CommSequence_byId(String seqid);
	int upd_CommSequence_byId(CommSequence seq);
}
