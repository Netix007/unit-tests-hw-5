## Урок 5. Другие виды тестирования

### Задание 1.

Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты.
Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

### Решение

#### Юнит тесты

1. Тест "Добавление контакта" - проверяет, корректно ли работает функция добавления нового контакта в базу данных.
2. Тест "Редактирование контакта" - проверяет корректность редактирования существующего контакта.
3. Тест "Удаление контакта" - проверяет возможность удаления контакта из базы данных.
4. Тест "Валидация полей" - гарантирует, что все обязательные поля при добавлении или редактировании контакта заполнены.
5. Тест на "Уникальность имени контакта" - проверка, что в базе данных нет двух контактов с одинаковым именем.

#### Интеграционные тесты

1. Тест "Получение всех контактов" - тестирует, корректно ли приложение возвращает все контакты из базы данных.
2. Тест "Восстановление удаленного контакта" - восстанавливает удаленный контакт из базы данных и проверяет его корректное отображение.

#### Cквозные тесты

1. Тест "Нахождение контакта по имени" - ищет контакт в базе данных по заданному имени и проверяет, возвращает ли приложение корректный результат.

### Задание 2.

Ниже список тестовых сценариев. Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест) и объяснить, почему вы так решили.

1. ""Проверка того, что функция addContact корректно добавляет новый контакт в список контактов"".
2. ""Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов"".
3. ""Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление"".

### Решение

1. Это юнит-тест. Он проверяет конкретную функциональность - добавление контакта - и включает в себя все необходимые проверки, чтобы убедиться, что функция работает правильно.
2. Это интеграционный тест. Этот тест проверяет, как различные части системы взаимодействуют друг с другом, в данном случае, между пользовательским интерфейсом и внутренним функционалом приложения.
3. Это сквозной тест. Он охватывает все этапы работы с контактом и проверяет, что каждый из них выполняется корректно.