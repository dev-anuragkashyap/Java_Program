class College{
    static String CollegeName;

    static{
        CollegeName="The Study hall College";
    }
    void display(){
        System.out.println("the college Name is "+CollegeName);
    }
    public static void main(String[]args){
        College obj1=new College();
        obj1.display();
    }
}