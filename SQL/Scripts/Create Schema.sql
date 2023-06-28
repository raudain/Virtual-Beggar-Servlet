SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema dbo
-- -----------------------------------------------------
DROP DATABASE IF EXISTS dbo;
CREATE SCHEMA dbo DEFAULT CHARACTER SET UTF8MB4 ;
USE dbo;

CREATE TABLE dbo.profession (
  Profession TINYINT UNSIGNED NOT NULL,
  ProfessionName VARCHAR(45) NOT NULL,
  PRIMARY KEY (Profession));
  -- UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  -- UNIQUE INDEX `type_UNIQUE` (`type` ASC) VISIBLE);

INSERT INTO profession (Profession, ProfessionName) VALUES
(11, 'Construction Worker'),
(12, 'Postman'),
(21, 'Artist'),
(22, 'Cook'),
(23, 'Magician'),
(24, 'Firefighter'),
(31, 'Scientist'),
(32, 'Journalist'),
(41, 'Doctor'),
(42, 'Computer Engineer'),
(43, 'Santa'),
(44, 'Lawyer'),
(51, 'Politician'),
(52, 'Pilot'),
(61, 'Mad Scientist'),
(71, 'Businessman');

CREATE TABLE dbo.endurance (
  Endurance TINYINT UNSIGNED NOT NULL,
  EnduranceName VARCHAR(45) NOT NULL,
  PRIMARY KEY (Endurance));
  -- UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  -- UNIQUE INDEX `level_UNIQUE` (`level` ASC) VISIBLE);

INSERT INTO endurance (Endurance, EnduranceName) VALUES
(1, 'Lazy'),
(2, 'Sleepy'),
(3, 'Diligent'),
(4, 'Productive'),
(5, 'Hard-working'),
(6, 'Tireless');

-- -----------------------------------------------------
-- Table `dbo`.`workers`
-- -----------------------------------------------------
CREATE TABLE dbo.worker (
  Room SMALLINT UNSIGNED NOT NULL,
  Name TINYTEXT NULL DEFAULT NULL,
  Profession TINYINT UNSIGNED NOT NULL,
  Endurance TINYINT UNSIGNED NOT NULL,
  Cost BIGINT UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (Room),
  FOREIGN KEY (Profession) REFERENCES profession(Profession),
  FOREIGN KEY (Endurance) REFERENCES endurance(Endurance)
);

INSERT INTO worker (Room, Name, Profession, Endurance, Cost) VALUES
-- Floor 1
(101, 'Terry', 71, 6, 1700),
(102, 'Timothy', 71, 6, 1700),
(103, 'Nicholas', 71, 6, 1700),
-- Floor 2
(201, 'Darlene', 71, 6, 1700),
(202, 'April', 71, 6, 1700),
(203, 'Martha', 32, 6, 125000000),
-- Floor 3
(301, 'Beverley', 42, 4, 10500000),
(302, 'Bryan', 51, 6, 5800000000),
(303, 'Thelma', 51, 6, 5800000000),
-- Floor 4
(401, 'Bernard', 43, 4, 10500000),
(402, 'Diana', 41, 6, 520000000),
(403, 'Jorge', 61, 3, 120000000),
-- Floor 5
(501, 'Mary', 52, 6, 5800000000),
(502, 'Roger', 41, 5, 40000000),
(503, 'Clifford', 11, 5, 0),
-- Floor 6
(601, 'Elsie', 32, 6, 125000000),
(602, 'Anthony', 31, 6, 125000000),
(603, 'Norman', 43, 6, 520000000),
-- Floor 7
(701, 'Carrie', 52, 3, 15500000),
(702, 'Debra', 61, 4, 400000000),
(703, 'Marcus', 61, 5, 2000000000),
-- Floor 8
(801, 'Marilyn', 71, 6, 1700),
(802, 'Danielle', 31, 5, 10000000),
(803, 'Judith', 61, 3, 120000000),
-- Floor 9
(901, 'Raymond', 11, 5, 0),
(902, 'Bonnie', 61, 5, 2000000000),
(903, 'Mary', 44, 6, 520000000),
-- Floor 10
(1001, 'Erin', 31, 5, 10000000),
(1002, 'Jack', 61, 5, 2000000000),
(1003, 'Regina', 61, 5, 2000000000),
-- Floor 11
(1101, 'Thomas', 52, 3, 15500000),
(1102, 'Vivian', 44, 5, 40000000),
(1103, 'Lauren', 41, 6, 520000000),
-- Floor 12
(1201, 'Carmen', 52, 4, 55000000),
(1202, 'Vivian', 52, 4, 55000000),
(1203, 'Craig', 51, 4, 55000000),
-- Floor 13
(1301, 'Janice', 52, 4, 55000000),
(1302, 'Andrew', 71, 6, 1700),
(1303, 'Karen', 52, 6, 5800000000),
-- Floor 14
(1401, 'Edith', 52, 6, 5800000000),
(1402, 'Vanessa', 52, 4, 55000000),
(1403, 'Shirley', 44, 5, 40000000),
-- Floor 15
(1501, 'Dawn', 42, 5, 40000000),
(1502, 'Rhonda', 42, 6, 520000000),
(1503, 'Kenneth', 41, 6, 520000000),
-- Floor 16
(1601, 'Eugene', 51, 3, 15500000),
(1602, 'Sally', 51, 6, 5800000000),
(1603, 'Marcus', 61, 3, 120000000),
-- Floor 17
(1701, 'Melvin', 61, 4, 400000000),
(1702, 'Leon', 71, 6, 1700),
(1703, 'Diane', 51, 4, 55000000),
-- Floor 18
(1801, 'Adam', 51, 3, 15500000),
(1802, 'Jerry', 44, 5, 40000000),
(1803, 'Dustin', 61, 5, 2000000000),
-- Floor 19
(1901, 'Howard', 71, 6, 1700),
(1902, 'Carlos', 42, 6, 520000000),
(1903, 'Jay', 42, 6, 520000000),
-- Floor 20
(2001, 'Phyllis', 51, 5, 260000000),
(2002, 'Carolyn', 52, 5, 260000000),
(2003, 'Walter', 43, 5, 40000000),
-- Floor 21
(2101, 'Joanne', 61, 5, 2000000000),
(2102, 'Roy', 61, 3, 120000000),
(2103, 'Ricardo', 51, 3, 15500000),
-- Floor 22
(2201, 'Raymond', 43, 6, 520000000),
(2202, 'Carl', 44, 5, 40000000),
(2203, 'Craig', 12, 5, 0),
-- Floor 23
(2301, 'Eva', 52, 6, 5800000000),
(2302, 'Kenneth', 51, 5, 260000000),
(2303, 'Rita', 44, 5, 40000000),
-- Floor 24
(2401, 'Florence', 52, 3, 15500000),
(2402, 'Dustin', 52, 3, 15500000),
(2403, 'Brandon', 51, 4, 55000000),
-- Floor 25
(2501, 'Julia', 61, 6, 48000000000),
(2502, 'Anita', 51, 4, 55000000),
(2503, 'Anne', 44, 5, 40000000),
-- Floor 26
(2601, 'Chad', 32, 5, 10000000),
(2602, 'Jesus', 32, 5, 10000000),
(2603, 'Clarence', 51, 6, 5800000000),
-- Floor 27
(2701, 'Lori', 61, 3, 120000000),
(2702, 'Nicholas', 41, 6, 520000000),
(2703, 'Steve', 51, 4, 55000000),
-- Floor 28
(2801, 'Justin', 61, 4, 400000000),
(2802, 'Jason', 52, 5, 260000000),
(2803, 'Fransisco', 43, 5, 40000000),
-- Floor 29
(2901, 'Zachary', 51, 3, 15500000),
(2902, 'Shane', 51, 2, 5000000),
(2903, 'Robin', 44, 6, 520000000),
-- Floor 30
(3001, 'Kathy', 51, 6, 5800000000),
(3002, 'Sara', 61, 3, 120000000),
(3003, 'Hector', 51, 4, 55000000),
-- Floor 31
(3101, 'Jean', 52, 6, 5800000000),
(3102, 'Eugene', 51, 4, 55000000),
(3103, 'Peter', 41, 6, 520000000),
-- Floor 32
(3201, 'Bernard', 61, 5, 2000000000),
(3202, 'Anna', 51, 5, 260000000),
(3203, 'Howard', 52, 5, 260000000),
-- Floor 33
(3301, 'Suzanne', 61, 3, 120000000),
(3302, 'Randall', 52, 5, 260000000),
(3303, 'Howard', 41, 4, 10500000),
-- Floor 34
(3401, 'Charlotte', 61, 6, 48000000000),
(3402, 'Wesley', 52, 5, 260000000),
(3403, 'Philip', 24, 6, 22000000),
-- Floor 35
(3501, 'Irene', 51, 3, 15500000),
(3502, 'Alice', 44, 4, 10500000),
(3503, 'Christina', 31, 5, 10000000),
-- Floor 36
(3601, 'Hector', 52, 6, 5800000000),
(3602, 'Esther', 44, 6, 520000000),
(3603, 'Douglas', 61, 4, 400000000),
-- Floor 37
(3701, 'Sally', 52, 4, 55000000),
(3702, 'Irene', 41, 6, 520000000),
(3703, 'Sharon', 52, 3, 15500000),
-- Floor 38
(3801, 'Hector', 51, 5, 260000000),
(3802, 'Norman', 43, 5, 40000000),
(3803, 'Vincent', 41, 4, 10500000),
-- Floor 39
(3901, 'Darrel', 41, 6, 520000000),
(3902, 'Judith', 51, 5, 260000000),
(3903, 'Joshua', 51, 4, 55000000),
-- Floor 40
(4001, 'Francis', 51, 6, 5800000000),
(4002, 'Thomas', 52, 5, 260000000),
(4003, 'Leonard', 51, 4, 55000000),
-- Floor 41
(4101, 'Travis', 71, 6, 1700),
(4102, 'Edward', 51, 5, 260000000),
(4103, 'Ida', 32, 6, 125000000),
-- Floor 42
(4201, 'Travis', 51, 4, 55000000),
(4202, 'Rita', 52, 4, 55000000),
(4203, 'Lee', 31, 5, 10000000),
-- Floor 43
(4301, 'Barry', 71, 6, 1700),
(4302, 'Nicholas', 51, 5, 260000000),
(4303, 'Clarence', 61, 4, 400000000),
-- Floor 44
(4401, 'Lauren', 44, 6, 520000000),
(4402, 'Irene', 71, 6, 1700),
(4403, 'Johnny', 52, 4, 55000000),
-- Floor 45
(4501, 'Wayne', 61, 4, 400000000),
(4502, 'Joshua', 52, 4, 55000000),
(4503, 'Sean', 42, 4, 10500000),
-- Floor 46
(4601, 'Alicia', 61, 6, 48000000000),
(4602, 'Brian', 42, 6, 520000000),
(4603, 'Douglas', 52, 4, 55000000),
-- Floor 47
(4701, 'Michael', 44, 3, 3050000),
(4702, 'Adam', 51, 1, 1600000);


SELECT worker.Room, worker.Name, profession.Profession AS Profession, endurance.EnduranceName AS Endurance, worker.Cost
FROM dbo.worker
INNER JOIN profession ON profession.Profession = worker.Profession
INNER JOIN endurance ON endurance.Endurance = worker.Endurance
ORDER BY worker.Room;