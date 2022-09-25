package com.example.designpatterns.builder;

import java.time.LocalDate;

public class Client {

    private static String builderBefore() {
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
        tourPlan.addPlan(1, "리조트 수영장에서 놀기");
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
        tourPlan.addPlan(2, "조식 부페에서 식사");
        tourPlan.addPlan(2, "체크아웃");
        return tourPlan.toString();
    }

    private static String builder1() {
        TourPlanBuilder tourPlanBuilder = new DefaultTourBuilder();
        tourPlanBuilder.title("칸쿤여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2000, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁식사")
                .getPlan();
        return tourPlanBuilder.getPlan().toString();
    }

    private static String builder2() {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        return tourPlan.toString();
    }

    private static String builder3() {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.longBeachTrip();
        return tourPlan.toString();
    }

    public static void main(String[] args) {
        System.out.println(builderBefore());
        System.out.println(builder1());
        System.out.println(builder2());
        System.out.println(builder3());
    }
}
