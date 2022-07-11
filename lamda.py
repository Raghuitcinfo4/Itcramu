a=lambda x,y,z:x*y*z
print(a(10,20,30))

def f1(n):
    return lambda x:x*n
f2=f1(7)
print(f2(2))
list1=[34,21,12,83]
x=list(filter(lambda y:(y%2==0),list1))
print(x)