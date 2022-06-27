class A:
    def test1(self):
        print("my programme itc")

class B:
    def test2(self):
        print("my 2rd programme")
class C(A,B):
    def test3(self):
        print("its 3rd programme")

x=C()
x.test1()
x.test2()
x.test3()