package com.yiming.java;

import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.JiebaSegmenter.SegMode;

public class FenCiMain {

	/*
	 * the main file of the whole project.
	 * ��Project�е�����һ����utf-8���룬��Ȼ�������롣
	 * ����Ŀ�е�.txt��.dict��Щ�����ļ�Ҫ����srcĿ¼�£������ܲ�������
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JiebaSegmenter segmenter = new JiebaSegmenter();
		String[] sentences =
		        new String[] {"����һ�����ֲ�����ָ�ĺ�ҹ���ҽ�����գ��Ұ��������Ұ�Python��C++��", "�Ҳ�ϲ���ձ��ͷ���", "�׺�ع��˼䡣",
		                      "���Ŵ�Ů����ÿ�¾����������Ҷ�Ҫ�׿ڽ���24�ڽ������ȼ����������İ�װ����", "�����ĺ���δ������",
		                      "����ʹ��Github��ѧϰ���룬������ѧϰJava���Ŀ�Դ�ִʷ���",
		                      "����ִ�Ч��ò�ƻ�����"
		                      };
		System.out.println(segmenter.process("�������µ��������ִ�Ч��", SegMode.INDEX).toString());
		
		//��forѭ����String�����е�ÿһ�仰���зִʲ���
	    for (String sentence : sentences) {
	        System.out.println(segmenter.process(sentence, SegMode.INDEX).toString());
	    }
		
		
		
	}

}
