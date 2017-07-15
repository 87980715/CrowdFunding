package com.redhat.crowdfunding.util;

import java.math.BigInteger;

/**
 * @author littleredhat
 */
public class Consts {
	// Gas�۸�
	public static BigInteger GAS_PRICE = BigInteger.valueOf(20_000_000_000L);
	// Gas����
	public static BigInteger GAS_LIMIT = BigInteger.valueOf(4_300_000L);
	// ETHER��̫��
	public static BigInteger ETHER = new BigInteger("1000000000000000000");
	// ��ʱ�ļ�ǰ׺
	public static String PREFIX = "key";
	// ��ʱ�ļ���׺
	public static String SUFFIX = ".tmp";
	// Ǯ������
	public static String PASSWORD = "123456";
	// Ǯ��·��
	public static String PATH = "/wallet.txt";
	// ��Լ��ַ
	public static String ADDR = "0x109c3E671EBc9C6A1C2b5fC8726E02Fbb1620Ad8";
}
