package IfElse;

public class IfElse2 {
    public static void main(String[] args) {
        int a=100;
        if(a>80) //true
        {
            System.out.println("itne paise dairy milk le lo : 80");
            a=a-80; //a=20
            if(a>=20)
            {
                System.out.println("Are wahh Jhumke bhi le leta hu : 19");
                a=a-19; //a=5
                if(a>=5)
                {
                    System.out.println("Are wahh toffee bhi le lu");
                    a=a-5; //a=0
                    if(a>0)
                    {
                        System.out.println("Are wahh silver pearl bhi le lu");
                    }
                    else
                    {
                        System.out.println("are ni paise khatam .....");
                    }
                }
                else{
                    System.out.println("dekhta hu kitne bache hai = "+ a);
                    if(a>=1)
                    {
                        System.out.println("Are wahh silver pearl bhi le lu");
                    }


                }
            }
        }
        else
        {
            System.out.println("toffee Mil Gyi...");
        }

    }
}
