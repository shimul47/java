arr = [15, 22, 12, 10,13, 11]
k = 2

arr.sort()
sum = 0
for i in range(len(arr)):
    sum+=arr[i]
 
print(sum)

maximum = 0
for i in range(k):
    temp2 = arr[-1]
    temp1 = arr[0] + arr[1]
    if sum-temp1>=sum-temp2:
        arr.pop(0)
        arr.pop(0)
        maximum=sum-temp1
        sum-=temp1
    else:
        arr.pop(-1)
        print(arr)
        maximum=sum-temp2
        sum-=temp2

print("k=",k,"  Max=",maximum,)

# codforces problem