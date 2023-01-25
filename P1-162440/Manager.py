from Employee import Employee

class Manager(Employee):
    __promotion_threshold: float

    def __init__(self,name: str, address: str, year_employment: int, promotion_threshold: float = 10):
        super().__init__(name,address,year_employment)
        self.__promotion_threshold = promotion_threshold
        if promotion_threshold < 10:
            print("nieprawidlowa wartosc kod bledu -10")

    @property
    def promotion_threshold(self):
        if promotion_threshold < 10:
            return self.__promotion_threshold

    @promotion_threshold.setter
    def promotion_threshold(self,value: float):
        self.promotion_threshold = value




