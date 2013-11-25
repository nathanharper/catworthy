-- Run this as MySQL root to create Catworthy schema.
-- `mysql -u root -p < sql/catdb.sql`
CREATE DATABASE IF NOT EXISTS `catdb`;
CREATE USER 'catuser'@'localhost' IDENTIFIED BY 'ilovecats';
GRANT SELECT ON `catdb`.* TO 'catuser'@'localhost';
USE `catdb`;
CREATE TABLE IF NOT EXISTS `cat` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(356) DEFAULT NULL,
    `subcopy` VARCHAR(356) DEFAULT NULL,
    `body` TEXT DEFAULT NULL,
    `video` VARCHAR(128) DEFAULT NULL,
    `image` VARCHAR(128) DEFAULT NULL,
    `url` VARCHAR(32) DEFAULT NULL,
    PRIMARY KEY (`id`)
) CHARACTER SET utf8;
