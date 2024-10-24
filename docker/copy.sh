#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20240629.sql ./mysql/db
cp ../sql/ry_config_20240902.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../aha-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy aha-gateway "
cp ../aha-gateway/target/aha-gateway.jar ./aha/gateway/jar

echo "begin copy aha-auth "
cp ../aha-auth/target/aha-auth.jar ./aha/auth/jar

echo "begin copy aha-visual "
cp ../aha-visual/aha-monitor/target/aha-visual-monitor.jar  ./aha/visual/monitor/jar

echo "begin copy aha-modules-system "
cp ../aha-modules/aha-system/target/aha-modules-system.jar ./aha/modules/system/jar

echo "begin copy aha-modules-file "
cp ../aha-modules/aha-file/target/aha-modules-file.jar ./aha/modules/file/jar

echo "begin copy aha-modules-job "
cp ../aha-modules/aha-job/target/aha-modules-job.jar ./aha/modules/job/jar

echo "begin copy aha-modules-gen "
cp ../aha-modules/aha-gen/target/aha-modules-gen.jar ./aha/modules/gen/jar

