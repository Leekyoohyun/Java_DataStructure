package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("말티즈",100);
        Cat cat = new Cat("샴",80);

        //강아지 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        //문제1: 개병원에 고양이가 감
        //dogHospital.setAnimal(cat); //컴파일 오류

        //개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.getBigger(new Dog("도베르만",200));
        System.out.println("biggerDog = "+biggerDog);
    }
}