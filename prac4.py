class sample:
    def __int__(self,name,age):
        self.name=name
        self.age=age
    def display(self):
        print(self.name,self.age)
class child1(sample):
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def display(self):
        print(self.name,self.age)
a=child1("Padma","priya")
a.display()


