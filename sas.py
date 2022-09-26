l=[1,1,2,2,4,2,2,3,6,6,3,6,3]
d=1
m="none because all element is in same frequency"
total=0
av=0
for i in range(len(l)):#to chack index
    c=0
    total=total+l[i]
    for j in l:
        if j==l[i]:
            c=c+1 
    if d<c:
        d=c
        m=l[i]
av=total/len(l)
print("\nmost frequently element is ",m)              
print("frequency is ",d)
print("average of given deta is ",av)