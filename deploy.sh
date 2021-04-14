#!/bin/bash


echo "Running Maven clean and Package"
mvn clean package
echo "================================"
echo "================================"

echo "Uploading file to S3 bucket and packing file to be deployed"
aws cloudformation package --template-file template.yml --output-template-file output-sam.yml --s3-bucket aws-historia-credito-jamar
echo "================================"
echo "================================"
echo "Uploading and deploying the lambda"
aws cloudformation deploy --template-file output-sam.yml --stack-name historia-credito-aws-app --capabilities CAPABILITY_IAM
echo "================================"
echo "================================"

echo "Success."