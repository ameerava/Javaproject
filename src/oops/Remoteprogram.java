package oops;

interface Tvremote{
	public void poweron();
	public void poweroff();
	public void channelup();
	public void channeldown();
}

interface Smarttvremote extends Tvremote{
	public void bluetooth();
	public void search();
	
}

class Tv implements Tvremote,Smarttvremote{

	@Override
	public void bluetooth() {
	System.out.println("bluetooth");
	}

	@Override
	public void search() {
		System.out.println("search");
		
	}

	@Override
	public void poweron() {
		System.out.println("power on");
		
	}

	@Override
	public void poweroff() {
		System.out.println("power off");
		
	}

	@Override
	public void channelup() {
		System.out.println("channel up");
		
	}

	@Override
	public void channeldown() {
		System.out.println("channeldown");
		
	}
	
}
public class Remoteprogram {

	public static void main(String[] args) {
		Tv ob=new Tv();
		ob.bluetooth();
		ob.channeldown();
		ob.channelup();
		ob.poweroff();
		ob.poweron();
		ob.search();

	}

}
