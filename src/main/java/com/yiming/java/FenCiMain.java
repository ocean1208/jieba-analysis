package com.yiming.java;

import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.JiebaSegmenter.SegMode;

public class FenCiMain {

	/*
	 * the main file of the whole project.
	 * 该Project中的中文一般是utf-8编码，不然就是乱码。
	 * 该项目中的.txt和.dict这些词语文件要放在src目录下，否则跑不起来。
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JiebaSegmenter segmenter = new JiebaSegmenter();
		String[] sentences =
		        new String[] {"这是一个伸手不见五指的黑夜。我叫孙悟空，我爱北京，我爱Python和C++。", "我不喜欢日本和服。", "雷猴回归人间。",
		                      "工信处女干事每月经过下属科室都要亲口交代24口交换机等技术性器件的安装工作", "结果婚的和尚未结过婚的",
		                      "我在使用Github来学习代码，现在在学习Java做的开源分词方法",
		                      "这个分词效果貌似还不错"
		                      };
		System.out.println(segmenter.process("我来试下单独的语句分词效果", SegMode.INDEX).toString());
		
		//用for循环对String数组中的每一句话进行分词操作
	    for (String sentence : sentences) {
	        System.out.println(segmenter.process(sentence, SegMode.INDEX).toString());
	    }
		
		
		
	}

}
