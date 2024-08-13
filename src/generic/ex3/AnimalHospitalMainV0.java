package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("말티즈",100);
        Cat cat = new Cat("샴",80);

        //강아지 병원
        dogHospital.setAnimal(dog);
        dogHospital.checkUp();

        //고양이 병원
        catHospital.setAnimal(cat);
        catHospital.checkUp();

        //문제1: 개병원에 고양이가 감
        //dogHospital.setAnimal(cat); //컴파일 오류

        //개 타입 반환
        dogHospital.setAnimal(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("도베르만",200));
        System.out.println("biggerDog = "+biggerDog);
    }
}
