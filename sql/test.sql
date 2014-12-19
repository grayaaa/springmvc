CREATE TABLE IF NOT EXISTS `test`.`days_user` (
  `id`          INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `device_type` VARCHAR(24),
  `device_num`  VARCHAR(24) UNIQUE,
  `create_time` DATE,
  `last_time`   DATE,
  `state`       INT(4),
  `nickname`    VARCHAR(24) UNIQUE
)
  ENGINE =InnoDB
  DEFAULT CHARSET utf8
  COLLATE utf8_general_ci;