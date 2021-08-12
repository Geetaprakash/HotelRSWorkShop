package com.company;
public class FindCheap {
        String hotelName;
        private int regularWeekDay;
        private int regularWeekEnd;
        private int rewardeeWeekDay;
        private int rewardeeWeekEnd;

    FindCheap(String name) {
        this.hotelName = name;
    }

        public int getRegularWeekDay() {
        return regularWeekDay;
        }

        public void setRegularWeekDay(int regularWeekDay) {
        this.regularWeekDay = regularWeekDay;
        }

        public int getRegularWeekEnd() {
        return regularWeekEnd;
        }

        public void setRegularWeekEnd(int regularWeekEnd) {
            this.regularWeekEnd = regularWeekEnd;
        }

        public int getRewardeeWeekDay() {
        return rewardeeWeekDay;
        }

        public void setRewardeeWeekDay(int rewardeeWeekDay) {
        this.rewardeeWeekDay = rewardeeWeekDay;
        }

        public int getRewardeeWeekEnd() {
        return rewardeeWeekEnd;
        }

        public void setRewardeeWeekEnd(int rewardeeWeekEnd) {
        this.rewardeeWeekEnd = rewardeeWeekEnd;
        }

        public String getHotelName() {
        return hotelName;
        }
    }