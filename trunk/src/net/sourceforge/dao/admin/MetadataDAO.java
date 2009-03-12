/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.dao.admin;

import java.util.List;

import net.sourceforge.dao.DAO;
import net.sourceforge.model.admin.Metadata;
import net.sourceforge.model.admin.MetadataDetail;
import net.sourceforge.model.metadata.MetadataDetailEnum;
import net.sourceforge.model.metadata.MetadataType;

/**
 * �������Metadata�Ľӿ�
 * @author ych
 * @version 1.0 (Nov 10, 2005)
 */
public interface MetadataDAO extends DAO {

    /**
     * �����ݿ�ȡ��ָ��id��Metadata
     * 
     * @param id
     *            Metadata��id
     * @return ����ָ����Metadata
     */
    public Metadata getMetadata(Integer id);
    
    /**
     * ����Metadata�������ݿ�
     * 
     * @param metadata
     *            ��Ҫ�����Metadata
     * @return ���ر����Metadata
     */
    public Metadata saveMetadata(Metadata metadata);

    /**
     * ����MetadataType�������ݿ�
     * 
     * @param mt
     *            ��Ҫ�����MetadataType
     * @return ���ر����Metadata
     */
    public Metadata saveMetadata(MetadataType mt);

    /**
     * �����ݿ�ȡ��ָ��id��type��MetadataDetail
     * 
     * @param id
     *            MetadataDetail��id
     * @param type
     *            MetadataDetail��type
     * @return ����ָ����MetadataDetail
     */
    public MetadataDetail getMetadataDetail(Integer id, Metadata type);

    /**
     * �����ݿ�ȡ��ָ��id��typeId��MetadataDetail
     * 
     * @param id
     *            MetadataDetail��id
     * @param typeId
     *            MetadataDetail��type��id
     * @return
     * @throws Exception
     */
    public MetadataDetail getMetadataDetail(Integer id, Integer typeId);

    /**
     * ����MetadataDetail
     * 
     * @param metadataDetail
     *            ��Ҫ�����MetadataDetail
     * @return ���ر����MetadataDetail
     */
    public MetadataDetail saveMetadataDetail(MetadataDetail metadataDetail);

    /**
     * ���� MetadataDetail
     * @param mde ��Ҫ�����MetadataDetailEnum����
     * @return ���ر����MetadataDetail
     */
    public MetadataDetail saveMetadataDetail(MetadataDetailEnum mde);
    
    /**
     * �������MetadataDetail���б�
     * @return ��������MetadataDetail�б�
     */
    public List getAllMetadataDetail();
    
    /**
     *  �������Metadata������
     * @return ����Metadata������
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
    public List getMetadataList(int pageNo,int pageSize);
    
}
