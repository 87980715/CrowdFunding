pragma solidity 0.4.11;

contract CrowdFunding {
	// �����ַ
	address beneficiary;
	// ��ǰ���
	uint amount;
	// ���캯��
	function CrowdFunding(address addr) {
		beneficiary = addr;
	}
	// ���ͽ��
	function sendCoin() payable {
		amount += msg.value;
	}
	// �ڳ�����¼�
	event CrowdEnd(address beneficiary, uint amount);
	// �����ڳ�
	function endCrowd() {
		beneficiary.transfer(amount);
		CrowdEnd(beneficiary, amount);
		amount = 0;
	}
}