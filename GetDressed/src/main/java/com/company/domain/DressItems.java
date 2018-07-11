package com.company.domain;

import java.util.HashMap;
import java.util.Map;

public class DressItems {

    public enum WeatherStatus {
        HOT,
        COLD
    }

    public enum Shoes {
        SANDALS("sandals"),
        BOOTS("boots");

        private static final Map<WeatherStatus, Shoes> lookup = new HashMap<>();

        static {
            lookup.put(WeatherStatus.HOT, SANDALS);
            lookup.put(WeatherStatus.COLD, BOOTS);
        }

        public static Shoes get(WeatherStatus temp) {
            return lookup.get(temp);
        }

        private String description;

        Shoes(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public enum Socks {
        SOCKS("socks");

        private String description;

        Socks(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public enum Shirt {
        SHIRT("shirt");

        private String description;

        Shirt(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public enum Jacket {
        JACKET("jacket");

        private String description;

        Jacket(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public enum Pants {
        SHORTS("shorts"),
        PANTS("pants");

        private static final Map<WeatherStatus, Pants> lookup = new HashMap<>();

        static {
            lookup.put(WeatherStatus.HOT, SHORTS);
            lookup.put(WeatherStatus.COLD, PANTS);
        }

        public static Pants get(WeatherStatus temp) {
            return lookup.get(temp);
        }

        private String description;

        Pants(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }


    public enum Headwear {
        SUNGLASSES("sunglasses"),
        HAT("hat");

        private static final Map<WeatherStatus, Headwear> lookup = new HashMap<>();

        static {
            lookup.put(WeatherStatus.HOT, SUNGLASSES);
            lookup.put(WeatherStatus.COLD, HAT);
        }

        public static Headwear get(WeatherStatus temp) {
            return lookup.get(temp);
        }

        private String description;

        Headwear(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public enum Pajamas {
        PAJAMAS_OFF("Removing PJs"),
        PAJAMAS_ON("Pajamas on");


        private String description;

        Pajamas(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public enum LeavingHouse {
        LEAVING_HOUSE("leaving house");

        private String description;

        LeavingHouse(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

}
