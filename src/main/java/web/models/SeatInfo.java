package web.models;

import java.io.Serializable;

import web.models.Seat;

public class SeatInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7652508700744297756L;

	public enum Status{OPTIONAL, OPTIONED, NOT_OPTIONAL, MAINTAINING;}
	
	private Status status;
	
	private Seat seat;
	
	public SeatInfo(Seat seat) {
		// TODO Auto-generated constructor stub
//		this.seat = new Seat(seat);
		this.seat = seat;
		this.status = Status.OPTIONAL;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Status getStatus() {
		return this.status;
	}

	public boolean isAvail() {
		// TODO Auto-generated method stub
		return this.status == Status.OPTIONAL;
	}

	public void setOptioned() {
		// TODO Auto-generated method stub
		this.status = Status.OPTIONED;
	}
	
}
