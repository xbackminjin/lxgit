public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        TravelSubject travelSubject = new TravelSubject();

        Person list = new Person(weatherSubject,travelSubject);


        weatherSubject.setDay("1007");
        weatherSubject.setMaxTmp(12);
        weatherSubject.setMinTmp(-5);


        weatherSubject.notifyObservers();
    }
