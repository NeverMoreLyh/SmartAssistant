package cn.sunline.assistant.service;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;

import cn.sunline.assistant.base.SpringJunitBaseTest;

public class ISequenceServiceTest extends SpringJunitBaseTest {
	@Resource
	ISequenceService seqService;
	@Test
	public void test1() {
		String seqid = seqService.getSequence("system");
		System.out.println("seqid="+seqid);
	}
	
	@Test
	public void test2() {
		String seqid = seqService.getSequenceWithName("system","system");
		System.out.println("seqid="+seqid);
	}

}
