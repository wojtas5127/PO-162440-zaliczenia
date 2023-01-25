class Employee:
    __name: str
    __adress: str
    __year_employment: int


    def __init__(self,name: str, address: str, year_employment: int) -> None:
        self.__name = name
        self.__adress = address
        self.__year_employment = year_employment


    @property
    def name(self) -> str:
        return self.__name

    @property
    def adress(self) -> str:
        return self.__adress

    @property
    def year_employment(self) -> int:
       return self.__year_employment



    @name.setter
    def name(self,value: str) -> str:
        self.__name = value

    @adress.setter
    def adress(self,value: str) -> str:
        self.__adress = value

    @year_employment.setter
    def year_employment(self,value: int) -> int:
        self.__year_employment = value


    def __str__(self) -> str:
        return """Nazwa pracownika: {}
                  Adres: {} 
                  Rok zatrudnienia: {} 
                 """.format(self.name, self.adress, self.year_employment)

    def __eq__(self, other: 'Employee'):
        if self.name == other.name:
            if self.year_employment == other.year_employment:
                if self.adress == other.adress:
                    return True
                return False
            return False
        return False








