package ketoTest;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import baseTest.BaseClassApp;
import skinObjectsRegestration.AnySpecialOccasionToLoseWeight;
import skinObjectsRegestration.BodyTypeYouWant;
import skinObjectsRegestration.CurrentBodyType;
import skinObjectsRegestration.CurrentWeight;
import skinObjectsRegestration.DiseaseSkin;
import skinObjectsRegestration.EmailId;
import skinObjectsRegestration.EventsDate;
import skinObjectsRegestration.GenderSelection;
import skinObjectsRegestration.HowActive;
import skinObjectsRegestration.HowExcitedToShedWeight;
import skinObjectsRegestration.HowSpendDay;
import skinObjectsRegestration.HowTall;
import skinObjectsRegestration.LastHappy;
import skinObjectsRegestration.MealPreparationTime;
import skinObjectsRegestration.Meat;
import skinObjectsRegestration.OneAndOnlyPlan;
import skinObjectsRegestration.OtherFoodItems;
import skinObjectsRegestration.PerfectWeight;
import skinObjectsRegestration.PlanPage;
import skinObjectsRegestration.SelectMultipleAnswer;
import skinObjectsRegestration.SocialCustomersPage;
import skinObjectsRegestration.SummaryOfOverallWellness;
import skinObjectsRegestration.TargetZone;
import skinObjectsRegestration.Veggies;
import skinObjectsRegestration.WhatDoYouWantToAchieve;
import skinObjectsRegestration.YourAge;
import skinObjectsRegestration.YourWeight;

public class KetoTest extends BaseClassApp {
	GenderSelection gender;
	CurrentBodyType currentBody;
	BodyTypeYouWant bodyPref;
	WhatDoYouWantToAchieve achieve;
	SocialCustomersPage social;
	TargetZone targetzone;
	LastHappy happy;
	MealPreparationTime time;
	Meat meat;
	Veggies veggies;
	OtherFoodItems otherItems;
	HowActive active;
	HowSpendDay spendDay;
	SelectMultipleAnswer multipleAnswer;
	HowExcitedToShedWeight shedWeight;
	DiseaseSkin disease;
	HowTall tall;
	CurrentWeight currentWeight;
	PerfectWeight perfectWeight;
	YourAge age;
	SummaryOfOverallWellness wellness;
	AnySpecialOccasionToLoseWeight occassion;
	EventsDate date;
	OneAndOnlyPlan plan;
	YourWeight weight;
	EmailId email;
	PlanPage planPage;

	@Test(testName = "men")
	public void MenNonVegTest() throws MalformedURLException, Throwable {
		gender = country.countrySelection();
		currentBody = gender.genderSelectionMen();
		bodyPref = currentBody.plump();
		achieve = bodyPref.fit();
		achieve.looseWeight();
		achieve.boostBrainPowe();
		achieve.reduceCholestrolLevel();
		achieve.improveBoneHealth();
		social = achieve.cont();
		targetzone = social.socialPage();
		targetzone.belly();
		targetzone.butt();
		targetzone.pecs();
		targetzone.legs();
		happy = targetzone.cont();
		happy.never();
		time = happy.contt();
		meat = time.upTo1hr();
		veggies = meat.eatAllNonVeg();
		otherItems = veggies.eatAllVeggies();
		active = otherItems.eatAllOthers();
		spendDay = active.iExerciseOneTwoTimesAWeek();
		multipleAnswer = spendDay.atWorkPlace();
		shedWeight = multipleAnswer.multipleAnswer();
		disease=shedWeight.wantToLose();
		tall = disease.disease();
		currentWeight = tall.howTallInFeet();
		perfectWeight = currentWeight.currentWeightLb();
		age = perfectWeight.perfectWeightInLb();
		wellness = age.yourAge();
		occassion = wellness.overAllWellness();
		date = occassion.specialEvent();
		plan = date.eventDate();
		weight = plan.oneAndOnlyPlan();
		email = weight.yourWeight();
		planPage = email.emailId();
		planPage.sixMonthPlan();
	}
	
	@Test(testName = "women")
	public void womenVegan() throws InterruptedException {
		gender = country.countrySelection();
		currentBody = gender.genderSelectionWomen();
		bodyPref = currentBody.volputious();
		achieve = bodyPref.fit();
		achieve.looseWeight();
		achieve.boostBrainPowe();
		achieve.reduceCholestrolLevel();
		achieve.improveBoneHealth();
		social = achieve.cont();
		targetzone = social.socialPage();
		targetzone.belly();
		targetzone.butt();
		targetzone.pecs();
		targetzone.legs();
		happy = targetzone.cont();
		happy.never();
		time = happy.contt();
		meat = time.upTo1hr();
		veggies = meat.vegan();
		otherItems = veggies.veggies();
		active = otherItems.veganUser();
		spendDay = active.iOftenGoForWalk();
		multipleAnswer = spendDay.atWorkPlace();
		shedWeight = multipleAnswer.multipleAnswer();
		disease=shedWeight.wantToLose();
		tall = disease.noDisease();
		currentWeight = tall.howTallInCm();
		perfectWeight = currentWeight.currentWeightLb();
		age = perfectWeight.perfectWeightInLb();
		wellness = age.yourAge();
		occassion = wellness.overAllWellness();
		plan = occassion.noEvent();
		weight = plan.oneAndOnlyPlan();
		email = weight.yourWeight();
		planPage = email.emailId();
		planPage.threeMonthPlan();
	}
	
	@Test(testName="vegetarian")
	public void ketoTestVegetarian() throws InterruptedException {
		gender = country.countrySelection();
		currentBody = gender.genderSelectionWomen();
		bodyPref = currentBody.volputious();
		achieve = bodyPref.cut();
		achieve.looseWeight();
		achieve.boostBrainPowe();
		achieve.reduceCholestrolLevel();
		achieve.improveBoneHealth();
		social = achieve.cont();
		targetzone = social.socialPage();
		targetzone.belly();
		targetzone.butt();
		targetzone.pecs();
		targetzone.legs();
		happy = targetzone.cont();
		happy.never();
		time = happy.contt();
		meat = time.upTo1hr();
		veggies = meat.vegetarian();
		otherItems = veggies.veggies();
		active = otherItems.vegUser();
		spendDay = active.iOftenGoForWalk();
		multipleAnswer = spendDay.atWorkPlace();
		shedWeight = multipleAnswer.multipleAnswer();
		disease=shedWeight.wantToLose();
		tall = disease.noDisease();
		currentWeight = tall.howTallInCm();
		perfectWeight = currentWeight.currentWeightKg();
		age = perfectWeight.perfectWeightInKg();
		wellness = age.yourAge();
		occassion = wellness.overAllWellness();
		plan = occassion.noEvent();
		weight = plan.oneAndOnlyPlan();
		email = weight.yourWeight();
		planPage = email.emailId();
		planPage.oneMonthPlan();
		
	}
	
	@Test(testName = "womenNonVeg")
	public void womenNonVegan() throws InterruptedException {
		gender = country.countrySelection();
		currentBody = gender.genderSelectionWomen();
		bodyPref = currentBody.volputious();
		achieve = bodyPref.fit();
		achieve.looseWeight();
		achieve.boostBrainPowe();
		achieve.reduceCholestrolLevel();
		achieve.improveBoneHealth();
		social = achieve.cont();
		targetzone = social.socialPage();
		targetzone.belly();
		targetzone.butt();
		targetzone.pecs();
		targetzone.legs();
		happy = targetzone.cont();
		happy.never();
		time = happy.contt();
		meat = time.upTo1hr();
		veggies = meat.eatAllNonVeg();
		otherItems = veggies.eatAllVeggies();
		active = otherItems.eatAllOthers();
		spendDay = active.iOftenGoForWalk();
		multipleAnswer = spendDay.atWorkPlace();
		shedWeight = multipleAnswer.multipleAnswer();
		disease=shedWeight.wantToLose();
		tall = disease.noDisease();
		currentWeight = tall.howTallInCm();
		perfectWeight = currentWeight.currentWeightLb();
		age = perfectWeight.perfectWeightInLb();
		wellness = age.yourAge();
		occassion = wellness.overAllWellness();
		plan = occassion.noEvent();
		weight = plan.oneAndOnlyPlan();
		email = weight.yourWeight();
		planPage = email.emailId();
		planPage.oneMonthPlan();
	}
}
