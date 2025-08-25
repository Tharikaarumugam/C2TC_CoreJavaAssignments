package Assignment_5;

import Assignment_5.KingFisher;

public class KingFisher implements Airfare {
        private int hours;
        private double costPerHour;

        public KingFisher() {}

        public KingFisher(int hours, double costPerHour) {
            this.hours = hours;
            this.costPerHour = costPerHour;
        }

        public int getHours() {
            return hours;
        }

        public void setHours(int hours) {
            this.hours = hours;
        }

        public double getCostPerHour() {
            return costPerHour;
        }

        public void setCostPerHour(double costPerHour) {
            this.costPerHour = costPerHour;
        }

        public Double calculateAmount() {
            return hours * costPerHour * 4;
        }
    }
