/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.service.admin;

import java.util.List;

import com.aof.model.admin.Metadata;
import com.aof.model.admin.MetadataDetail;
import com.aof.model.metadata.MetadataType;

/**
 * �������Metadata�Ľӿ�
 * @author ych
 * @version 1.0 (Nov 10, 2005)
 */
public interface MetadataManager {

    /**
     * �����ݿ�ȡ��ָ��id��Metadata
     * 
     * @param id
     *            Metadata��id
     * @return ����ָ����Metadata
     * 
     */
    public Metadata getMetadata(Integer id) ;

    /**
     * ����Metadata�������ݿ�
     * 
     * @param metadata
     *            ��Ҫ�����Metadata
     * @return ���ر����Metadata
     * 
     */
    public Metadata saveMetadata(Metadata metadata) ;

    /**
     * ����MetadataType�������ݿ�
     * 
     * @param metadataType
     *            ��Ҫ�����MetadataType
     * @return ���ر����Metadata
     * 
     */
    public Metadata saveMetadata(MetadataType metadataType) ;

    /**
     * �����ݿ�ȡ��ָ��id��type��MetadataDetail
     * 
     * @param id
     *            MetadataDetail��id
     * @param type
     *            MetadataDetail��type
     * @return ����ָ����MetadataDetail
     * 
     */
    public MetadataDetail getMetadataDetail(Integer id, Metadata type) ;

    /**
     * �����ݿ�ȡ��ָ��id��typeId��MetadataDetail
     * 
     * @param id
     *            MetadataDetail��id
     * @param typeId
     *            MetadataDetail��type��id
     * @return
     * 
     */
    public MetadataDetail getMetadataDetail(Integer id, Integer typeId) ;

    /**
     * ����MetadataDetail
     * 
     * @param metadataDetail
     *            ��Ҫ�����MetadataDetail
     * @return ���ر����MetadataDetail
     * 
     */
    public MetadataDetail saveMetadataDetail(MetadataDetail metadataDetail) ;

    /**
     * �õ�����Metadata����
     * 
     * @return ��������Metadata����
     */
    public int getMetadataListCount();

    /**
     * ����Metadata�����б�
     * 
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @return ����Metadata�����б�
     */
    public List getMetadataList(int pageNo, int pageSize);

}
