package generic.ex3;

public class AnimalHospitalV2<T>{

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup(){
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없기때문에 오류
        // 쉽게 말해 T가 뭐가 들어올지 모르는데 Animal 자식이 아닐수도 있잖아 그래서 컴파일 오류
//        System.out.println("동물 이름 = " + animal.getName());
//        System.out.println("동물 크기 = " + animal.getSize());
//        animal.sound();
        animal.toString();
        animal.equals(null);
    }

    public T getBigger(T target){
       //컴파일오류
       // return animal.getSize() > target.getSize() ? animal : target ;
        return null;
    }

}
