public class Name {

    private String fName;
    private String mName;
    private String lName;


    public Name(){

    }

    public Name(String fName) {
        this.fName = fName;
    }

    public Name(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public Name(String fName, String mName, String lName) {
        this.lName = lName;
        this.fName = fName;
        this.mName = mName;
    }

    public void setName(String lName, String fName, String mName) {
        this.lName = lName;
        this.fName = fName;
        this.mName = mName;
    }

    public void setFName(String fName){
        this.fName = fName;
    }

    public String getFName(){
        return fName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public String getMName() {
        return mName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getLName() {
        return lName;
    }

    public char getMnameInitial() {
        return (mName != null && !mName.isEmpty()) ? mName.charAt(0) : '\0';
    }


    public void displayName() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getFName());

        if (getMName() != null && !getMName().isEmpty()) {
            sb.append(" ").append(getMnameInitial()).append(".");
        }

        sb.append(" ").append(getLName());

        return sb.toString();
    }
}
