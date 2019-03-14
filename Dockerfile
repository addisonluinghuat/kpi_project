From openjdk:8
copy ./target/food.war food.war
CMD ["java","-jar","food.war"]