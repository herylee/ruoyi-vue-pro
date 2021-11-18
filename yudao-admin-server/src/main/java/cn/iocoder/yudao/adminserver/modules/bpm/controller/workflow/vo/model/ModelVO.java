package cn.iocoder.yudao.adminserver.modules.bpm.controller.workflow.vo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 新增模型 VO
 * @author yunlongn
 */
@Data
public class ModelVO {

    @ApiModelProperty(value = "模型Id")
    private String id;

    @ApiModelProperty(value = "模型名字", required = true)
    private String name;

    @ApiModelProperty(value = "模型描述")
    private String description;

    @ApiModelProperty(value = "版本号")
    private Integer revision;

    @ApiModelProperty(value = "key值")
    private String key;

    @ApiModelProperty(value = "bpmnXml")
    private String bpmnXml;
}