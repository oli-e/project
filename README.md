> ### Projekt na Pracownie Programowania V 

# Sprzedaż voucherów :ticket:
#### Wdrożona aplikacja, pozwalająca zarezerwować, opłacić towar lub usługę oraz dostarczyć zamówienie drogą elektroniczną.


- [ ] Wstępny zestaw voucherów jest zdefiniowany w systemie :arrow_right: **JSON**
- [x] Katalog pozwala dodawać oraz modyfikować istniejące produkty
- [x] Katalog zawiera informacje tj. Tytuł, opisu, zdjecie oraz cenę
- [ ] Produkty mogą być oznaczone jako dostępne do sprzedazy bądź wycofane

### **Milestone1**

- [x] Zarządzanie listą produktów z poziomu serwisu
- [x] Ekspozycja listy produktów via HTTP endpoint
- [ ] Testy funkcjonalne i jednostkowe
- [ ] Automatyzacja budowania projektu z wykorzystanie narzędzia CI (github actions, gitlab ci lub inne)


---------------

*W pełni gotowy, gdy posiada...*

- [ ] Klienci wybierają produkty dodając je do koszyka
- [ ] Klienci nie mogą wielokrotnie dodać tej samej pozycji do koszyka, równoznaczne jest to ze zwiększeniem ilości towaru w koszyku
- [ ] Klienci przed zatwierdzeniem zamówienia muszą zobaczyć aktualny kosztorys wraz z przyznanymi rabatami
- [ ] Kosztorys moze zawierać rabaty procentowe oraz kwotowe
- [ ] Jeżeli klient zatwierdza zamówienie wówczas system aktualizuje stany magazynowe nie pozwalajac na dalszą sprzedaz produktu jezeli nie ma go juz na stanie
- [ ] W przypadku braku produktu, mógłby zaproponować zamiennik ?! **(zastanowimy się XD)**
