package dev.vivek.Builder;

public class BuilderClass {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    private BuilderClass(Builder builder){
        // fill in the fields
        this.name = builder.name;
        this.address = builder.address;
    }
    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private String address;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public BuilderClass build(){
            // conditions
            if(name == null || address == null){
                throw new RuntimeException("Name and address are required");
            }
            return new BuilderClass(this);
        }

    }
}
