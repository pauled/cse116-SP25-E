from abc import ABC, abstractmethod

class GameItem:
    def __init__(self,xloc,yloc):
        self.xLoc=xloc
        self.yLoc=yloc

    def move(self, dx, dy):
        self.xLoc+=dx
        self.yLoc-=dy

    def getxLoc(self):
        return self.xLoc

    def getyLoc(self):
        return self.yLoc

    def __str__(self):
        out="loc: ("+str(self.getxLoc())+","
        out+=str(self.getyLoc())+") "
        return out

class WTF(ABC):
    def __init__(self):
        self.truth=True

    def getTruth(self):
        return self.truth

    @abstractmethod
    def useless(self):
        pass

class Player(GameItem,WTF):
    def __init__(self, maxHP):
        GameItem.__init__(self,0,0)
        WTF.__init__(self)
        self.maxHP=maxHP
        self.HP=maxHP
        self.damageDealt=4
        self.inventory=[]

    def useless(self):
        print("useless")

    def pickupItem(self,gi):
        self.inventory.append(gi)

    def takeDamage(self,damage):
        self.HP-=damage

    def getDamageDealt(self):
        return self.damageDealt

    def getMaxHP(self):
        return self.maxHP

    def setDamageDealt(self,damage):
        self.damageDealt=damage

    def __str__(self):
        temp=GameItem.__str__(self)
        temp+= " Health: " + str(self.HP) + "/" +str(self.maxHP)
        temp+=", damageDealt=" + str(self.damageDealt)
        return temp
    
if __name__ == '__main__':
    p1=Player(10)
    p2=Player(8)
    p3=p1
    p3.takeDamage(5)
    print(p1)
    p1.xLoc=13
    print(p1.getxLoc())
    print(p1.getTruth())
    p1.useless()
