package com.aha.system.api;

import com.aha.common.core.constant.ServiceNameConstants;
import com.aha.common.core.domain.R;
import com.aha.system.api.domain.SysFile;
import com.aha.system.api.factory.RemoteFileFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件服务
 *
 * @author aha
 */
@FeignClient(contextId = "remoteFileService", value =
        ServiceNameConstants.FILE_SERVICE, fallbackFactory =
        RemoteFileFallbackFactory.class)
public interface RemoteFileService {
    /**
     * 上传文件
     *
     * @param file 文件信息
     * @return 结果
     */
    @PostMapping(value = "/upload", consumes =
            MediaType.MULTIPART_FORM_DATA_VALUE)
    public R<SysFile> upload(@RequestPart(value = "file") MultipartFile file);
}
