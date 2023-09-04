package com.cdac.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="GymMember")
public class GymMember {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int memberId;
	private String gender;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date joinDate;
	private double height;
	private double weight;
	private boolean payment_status;

	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="membershipPlanId")
	private MembershipPlan membershipPlan;
	
	@ManyToOne
	@JoinColumn(name="activity_id")
	private Activity activity;

	@ManyToOne(optional = true)
	@JoinColumn(name="workoutid")
	private WorkoutPlan workoutPlan;
	
	@ManyToOne(optional = true)
	@JoinColumn(name="planId")
	private DietPlan dietPlan;
	
	public GymMember() {
		
	}



	







	public GymMember(int memberId, String gender, Date joinDate, double height, double weight, boolean payment_status,
			User user, MembershipPlan membershipPlan, Activity activity, WorkoutPlan workoutPlan, DietPlan dietPlan) {
		super();
		this.memberId = memberId;
		this.gender = gender;
		this.joinDate = joinDate;
		this.height = height;
		this.weight = weight;
		this.payment_status = payment_status;
		this.user = user;
		this.membershipPlan = membershipPlan;
		this.activity = activity;
		this.workoutPlan = workoutPlan;
		this.dietPlan = dietPlan;
	}











	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public MembershipPlan getMembershipPlan() {
		return membershipPlan;
	}

	public void setMembershipPlan(MembershipPlan membershipPlan) {
		this.membershipPlan = membershipPlan;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}


	public boolean isPayment_status() {
		return payment_status;
	}

	public void setPayment_status(boolean payment_status) {
		this.payment_status = payment_status;
	}

	

	public WorkoutPlan getWorkoutPlan() {
		return workoutPlan;
	}


	public void setWorkoutPlan(WorkoutPlan workoutPlan) {
		this.workoutPlan = workoutPlan;
	}

	
	

	public DietPlan getDietPlan() {
		return dietPlan;
	}

	public void setDietPlan(DietPlan dietPlan) {
		this.dietPlan = dietPlan;
	}











	@Override
	public String toString() {
		return "GymMember [memberId=" + memberId + ", gender=" + gender + ", joinDate=" + joinDate + ", height="
				+ height + ", weight=" + weight + ", payment_status=" + payment_status + ", user=" + user
				+ ", membershipPlan=" + membershipPlan + ", activity=" + activity + ", workoutPlan=" + workoutPlan
				+ ", dietPlan=" + dietPlan + "]";
	}





	



	

		
	
	
	
	
}
