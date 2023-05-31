package ch08.sec02;

public class Audio implements RemoteControl {
	//필드 =>setVolume 메소드 위해서 생성
	private int volume;
	private int memoryVolume;
	
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		//볼륨의 크기를 0~10 사이를 유지시킴
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;  //0~10 사이의 값을 지정
		}
		
		System.out.println("현재 audio 볼륨: " + this.volume);
	}

	//디폴트 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;  // memoryVolume 에 무음 전 volume 기억시키기
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume);  // 원래 볼륨크기로 돌려줌
			
		}
	}
	
	
	
	

}
