package src.talento.a2020.m02.d18;

import java.util.ArrayList;
import java.util.Collections;

public class Robot  implements Comparable<Robot> {
	ArrayList<Robot> arrRobot =new ArrayList<Robot>();

	Integer iNrobot,iVida;
	public Robot() {}
	public Robot(Integer iNrobot, Integer iVida) {
		super();
		this.iNrobot = iNrobot;
		this.iVida = iVida;
	}
	public Integer getiNrobot() {
		return iNrobot;
	}
	public void setiNrobot(Integer iNrobot) {
		this.iNrobot = iNrobot;
	}
	public Integer getiVida() {
		return iVida;
	}
	public void setiVida(Integer iVida) {
		this.iVida = iVida;
	}
	
	public void ingresarRobot() {

		iNrobot= (int) (Math.random()*6+5);
		System.out.println("Random"+iNrobot);
		for (int i = 0; i < iNrobot; i++) {
			Robot robot=new Robot ();
			iVida= (int) (Math.random()*100-0);	
			robot.setiVida(iVida);
			robot.setiNrobot(i);
			//System.out.println("vida" +robot.getiVida());
			//System.out.println("numero de robot"+robot.getiNrobot());
			arrRobot.add(robot);
			
		}
		for (int i = 0; i < arrRobot.size(); i++) {
			System.out.println("Numero de Robot:  "+arrRobot.get(i).getiNrobot()+" , Porcentaje de Vida: " +arrRobot.get(i).getiVida());
		}
	}
	
	public void OrdenarArreglo() {
		
		System.out.println("********ordenar *********");
		Collections.sort(arrRobot);
		
		for (int i = 0; i < arrRobot.size(); i++) {
			System.out.println("Numero de Robot:  "+arrRobot.get(i).getiNrobot()+" , Porcentaje de Vida: " +arrRobot.get(i).getiVida());
		}
	}
	
	@Override
	public int compareTo(Robot o) {
		return this.iVida - o.iVida; 
	}
}
