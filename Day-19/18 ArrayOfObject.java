class ConstructorArrayPass {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public ConstructorArrayPass(String subID, String name, int maxMarks, int marksObtain) {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
        this.marksObtain=marksObtain;
    }

    public String getSubID(){
        return subID;
    }

    public String getName(){
        return name;
    }

    public int getMaxMarks(){
        return maxMarks;
    }

    public int getMarksObtain(){
        return marksObtain;
    }

    public void setMaxMarks(int maxMarks){
        this.maxMarks=maxMarks;
    }

    public void setMarksObtain(int marksObtain){
        this.marksObtain=marksObtain;
    }

    boolean isQualified(int marksObtain){
        return this.marksObtain >= maxMarks;
    }

    public String toString(){
        return "\nSubject ID: "+subID+"\nName: "+name+"\nMarks Obtained: "+marksObtain;
    }
}
class ArrayOfObject {
    public static void main(String[] args) {
        ConstructorArrayPass C[] = new ConstructorArrayPass[3];
        C[0]=new ConstructorArrayPass("4533f","Math",100,90);
        C[1]=new ConstructorArrayPass("53j3","DSA",100,60);
        C[2]=new ConstructorArrayPass("245j3","CS",100,70);

        for (ConstructorArrayPass x:C){
            System.out.println(x);
        }
    }
}

