if [ $# -ne 1 ]
then
    echo "Usage: $0   number"
    echo "       I will find sum of all digit for given number"
    echo "       For eg. $0 123, I will print 6 as sum of all digit (1+2+3)"
    exit 1
fi

n=$1
sum=0
sd=0
while [ $n -gt 0 ]
do
    sd=`expr $n % 10`
    sum=`expr $sum + $sd`
    n=`expr $n / 10`
done
    echo  "Sum of digit for numner is $sum"

