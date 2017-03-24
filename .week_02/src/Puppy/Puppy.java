package Puppy;

/**
 * Created by YurievAP on 22.03.2017.
 */
public class Puppy{

    int puppyAge;

    public Puppy(String name){
        // Это конструктор и у него один параметр, name.
        System.out.println("Передаваемое имя: " + name );
    }
    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        System.out.println("Возраст щенка: " + puppyAge );
        return puppyAge;
    }
    public static void main(String []args){
      /* Создание объекта. */
        Puppy myPuppy = new Puppy( "Багет" );

      /* Вызов метод класса, чтобы установить возраст щенка. */
        myPuppy.setAge( 2 );

      /* Вызов другого метода класса, чтобы получить возраст щенка. */
        myPuppy.getAge( );

      /* Получение переменной экземпляра класса. */
        System.out.println("Значение переменной: " + myPuppy.puppyAge );
    }
}