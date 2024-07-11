package chapter13;

public interface Scheduler {
	
	public void getNextCall();
	public void sendCalltoAgent ();
	
}

//-------------------------------------------------

class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("다음 순서 상대방에게 배분합니다");
	}
	
}

//-------------------------------------------------

class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("현재 상담업무가 없거나 상담 대기 시간이 가장 적은 상담원에게 배분합니다");
	}
	
}

//-------------------------------------------------

class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 순서대로 대기열에서 가져옵니다");
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("업무 Skill 값이 가장 높은 상담원에게 우선적으로 배분합니다");
	}
	
}




























