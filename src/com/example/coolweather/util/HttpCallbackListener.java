
package com.example.coolweather.util;

public interface HttpCallbackListener{
	
	void onFinish(String response);//���������ɹ���Ӧ��ʱ�����ø÷���
	
	void onError(Exception e);//������������������ʱ�����ø÷���
}