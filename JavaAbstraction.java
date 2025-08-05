package com.darshan;

abstract class car{
	abstract void musicplayer();
}
class JBL extends car{
	public void musicplayer() {
		System.out.println("Bass 50, Trouble 70,High vol 100");
	}
}
public class JavaAbstraction {
	public static void main(String[] args) {
		JBL b=new JBL();
		b.musicplayer();
		
	}

}
