//package day20250513.builder.builder2;
//
//import day20250513.builder.builder1.Builder;
//
//public class User {
//    private String name;
//    private String email;
//    private String password;
//    private String phone;
//    private String address;
//    private boolean sex;
//    private int age;
//
//    public User() { }
//
//    private User (String name, String email, String password, String phone, String address, boolean sex, int age) {
//                this. name = name;
//                this.email = email;
//                this. password = password;
//                this. phone = phone;
//                this.address = address;
//                this.sex = sex;
//                this.age = age;
//    }
//    public User() {
//    }
//    @lombok.Builder
//    private User (String name, String email, String password, String phone, String address, boolean sex, int age) {
//        this.name = name;
//        this. email = email;
//        this. password = password;
//        this. phone = phone;
//        this. address = address;
//        this.sex = sex;
//        this. age = age;
//    }
//
//    public static class Builder {
//        private String name;
//        private String email;
//        private String password;
//        private String phone;
//        private String address;
//        private boolean sex;
//        private int age;
//
//        private Builder() { }
//        public Builder name(String name) {
//            this.name = name;
//            return this;
//        }
//            public Builder email (String email){
//                this.email = email;
//                return this;
//            }
//        }
//
//
//    public day20250513.builder.builder1.Builder password(String password) {
//        this.password = password;
//        return this;
//    }
//    public day20250513.builder.builder1.Builder phone(String phone) {
//        this.phone = phone;
//        return this;
//    }
//    public day20250513.builder.builder1.Builder address(String address) {
//        this.address = address;
//        return this;
//    }
//    public day20250513.builder.builder1.Builder sex(boolean sex) {
//        this.sex = sex;
//        return this;
//    }
//    public day20250513.builder.builder1.Builder age(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public User build() {
//        return new User(name, email, password, phone, address, sex, age);
//    }}
//
//    public static day20250513.builder.builder1.Builder builder() {
//        return new day20250513.builder.builder1.Builder();
//    }
//
//    }
//

