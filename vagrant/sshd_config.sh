#! /usr/bin/env bash

now=$(date +"%m_%d_%Y")
# SSH 날짜별로 백업
cp /etc/ssh/sshd_config /etc/ssh/sshd_config_$now.backup
#비밀번호 로그인 허용
sed -i -e 's/PasswordAuthentication no/PasswordAuthentication yes/g' /etc/ssh/sshd_config
#SSH 서비스 재시작
systemctl restart sshd