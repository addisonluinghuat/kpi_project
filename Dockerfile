From openjdk:8
copy ./target/product.war product.war
CMD ["java","-jar","product.war"]