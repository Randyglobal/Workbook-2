package com.pluralsight;

public class CellPhone {
        private int serialNumber = 0;
        private String model = "";
        private String carrier = "";
        private String phoneNumber = "";
        private final String owner;

        //    Constructor
//    Instantiating the state of the object and assigning the original modal to the parameters
//    Thus when calling the object in the main class, I pass in the same variable so i can easily access the values
        public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
            this.serialNumber = serialNumber;
            this.model = model;
            this.carrier = carrier;
            this.phoneNumber = phoneNumber;
            this.owner = owner;
        }

//        Getting all the data from user
        public int getSerialNumber() {
            return serialNumber;
        }
        public String getModel() {
        return model;
        }
        public String getCarrier() {
        return carrier;
        }
        public String getPhoneNumber() {
        return phoneNumber;
        }
        public String getOwner() {
        return owner;
        }
//        setting results
//       public void setSerialNumber(int serialNumber) {
//        this.serialNumber = serialNumber;
//       }
//        public void setModel(String model) {
//            this.model = model;
//        }public void setCarrier(String carrier) {
//            this.carrier = carrier;
//        }public void setPhoneNumber(int phoneNumber) {
//            this.phoneNumber = phoneNumber;
//        }public void setOwner(String owner) {
//            this.owner = owner;
//        }
}
